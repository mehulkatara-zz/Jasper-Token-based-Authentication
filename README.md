# Token Based Authentication

If you have an application or portal you want to use with JasperReports Server, but do not have an existing single sign-on environment, you can use the Jaspersoft token-based authentication and user management framework. To work with token-based authentication, your application or portal must do the following:


1. Copy below file


    **(For Community Editions Only)**

        applicationContext-externalAuth-preAuth.xml
    **(For Commercial Editions Only)**
    
    rename to 

        applicationContext-externalAuth-preAuth-mt.xml
        
2. Paste this file to 

    **(For Community Editions Only)**

        C:\Jaspersoft\jasperreports-server-cp-6.4.2\apache-tomcat\webapps\jasperserver\WEB-INF
        

#### Token format configuration 
    
* Example for token: 

        pp=u=mehul|exp=201802161800
        
* Encode token when you use in your application 

        localhost:8080/jasperserver?pp=u=mehul%7Cexp=201802161835
   * | replaced by %7C

   - enter valide time for token expiretime formate yyyyMMddHHmm 
        

### Tested under Community Editions Only        
