package xzcode.qqsms.yunxinhulian.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import xzcode.qqsms.yunxinhulian.QpSmsYunxinhulianService;

@Configuration
@ConditionalOnProperty(prefix = QpSmsYunxinhulianSpirngbootAutoConfiguration.PROPERTIES_PREFIX, name = "enabled", havingValue = "true")
@ConditionalOnMissingBean(value = QpSmsYunxinhulianService.class)
public class QpSmsYunxinhulianSpirngbootAutoConfiguration implements ApplicationContextAware {

    private static final Logger logger = LoggerFactory.getLogger(QpSmsYunxinhulianSpirngbootAutoConfiguration.class);

    public static final String PROPERTIES_PREFIX = "qpsms.yunxinhulian";

    private ApplicationContext applicationContext;
    
    
    @ConfigurationProperties(prefix = PROPERTIES_PREFIX)
    @Bean
    public QpSmsYunxinhulianService qpSmsYunxinhulianService() {
    	return new QpSmsYunxinhulianService(qpSmsYunxinhulianConfig());
    }
    @ConfigurationProperties(prefix = PROPERTIES_PREFIX)
    @Bean
    public QpSmsYunxinhulianConfig qpSmsYunxinhulianConfig() {
    	return new QpSmsYunxinhulianConfig();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
    
    

}
