# Token Based Authentication
**Never use without encryption mechanism for production**



1. Copy below file


    **(For Community Editions Only)**

        applicationContext-externalAuth-preAuth.xml
    **(For Commercial Editions Only)**
    
    rename to 

        applicationContext-externalAuth-preAuth-mt.xml
        
2. Paste this file to 

       
        <js-install>\apache-tomcat\webapps\jasperserver\WEB-INF
   

3. Copy below file

        cipher3.jar

4. Paste this file to 

         <js-install>\apache-tomcat\webapps\jasperserver\WEB-INF\lib
        

#### Token format configuration 

* Import Cipher Project to Eclipse

* Encode token : 

    ![Eclipse Screenshot](https://raw.githubusercontent.com/mehulkatara/Jasper-Token-based-Authentication/master/With%20encryption%20mechanism/Eclipse.png)

        
* Pass token when you use in your application 

        localhost:8080/jasperserver?pp=nnwOxYNvkBbdsyVOAkOmWvZA/p1uCyt0HzSNJaSq
   * | replaced by %7C
   
   * Enter valide time for token expiretime formate yyyyMMddHHmm
   
   * Use strong algorithum to prevent attackers.
   
   * Token must not contain '+' symbole.
   
   
   
        

> **Tested under Community Editions Only**
