# Token-based-Authentication

If you have an application or portal you want to use with JasperReports Server, but do not have an existing single sign-on environment, you can use the Jaspersoft token-based authentication and user management framework. To work with token-based authentication, your application or portal must do the following:


1. Copy below file


    **(For Community Editions Only)**

        applicationContext-externalAuth-preAuth.xml
    **(For Commercial Editions Only)**
    
    rename to 

        applicationContext-externalAuth-preAuth-mt.xml
        
2. Paste this file to 

    (Community Editions)

        C:\Jaspersoft\jasperreports-server-cp-6.4.2\apache-tomcat\webapps\jasperserver\WEB-INF
        

#### Token format configuration 
    
* example for token: 


        u=obama|exe=201812250001
        <expire time formate yyyyMMddHHmm>
        
**Tested under Community Editions Only**        
