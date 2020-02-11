
/**
 * VersionsCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */

    package com.microsoft.schemas.sharepoint.soap;

    /**
     *  VersionsCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class VersionsCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public VersionsCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public VersionsCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for deleteAllVersions method
            * override this method for handling normal response from deleteAllVersions operation
            */
           public void receiveResultdeleteAllVersions(
                    com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteAllVersions operation
           */
            public void receiveErrordeleteAllVersions(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteVersion method
            * override this method for handling normal response from deleteVersion operation
            */
           public void receiveResultdeleteVersion(
                    com.microsoft.schemas.sharepoint.soap.DeleteVersionResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteVersion operation
           */
            public void receiveErrordeleteVersion(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getVersions method
            * override this method for handling normal response from getVersions operation
            */
           public void receiveResultgetVersions(
                    com.microsoft.schemas.sharepoint.soap.GetVersionsResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getVersions operation
           */
            public void receiveErrorgetVersions(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for restoreVersion method
            * override this method for handling normal response from restoreVersion operation
            */
           public void receiveResultrestoreVersion(
                    com.microsoft.schemas.sharepoint.soap.RestoreVersionResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from restoreVersion operation
           */
            public void receiveErrorrestoreVersion(java.lang.Exception e) {
            }
                


    }
    