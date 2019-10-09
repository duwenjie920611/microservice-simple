package com.tradeo.exp.common.message.EXP312;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sw.busi.swspl.entity.message.common.EXP312 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sw.busi.swspl.entity.message.common.EXP312
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Package }
     * 
     */
    public Package createPackage() {
        return new Package();
    }

    /**
     * Create an instance of {@link Package.DataInfo }
     * 
     */
    public Package.DataInfo createPackageDataInfo() {
        return new Package.DataInfo();
    }

    /**
     * Create an instance of {@link Package.DataInfo.SignedData }
     * 
     */
    public Package.DataInfo.SignedData createPackageDataInfoSignedData() {
        return new Package.DataInfo.SignedData();
    }

    /**
     * Create an instance of {@link Package.DataInfo.SignedData.Data }
     * 
     */
    public Package.DataInfo.SignedData.Data createPackageDataInfoSignedDataData() {
        return new Package.DataInfo.SignedData.Data();
    }

    /**
     * Create an instance of {@link Package.DataInfo.SignedData.Data.EXP312 }
     * 
     */
    public Package.DataInfo.SignedData.Data.EXP312 createPackageDataInfoSignedDataDataEXP312() {
        return new Package.DataInfo.SignedData.Data.EXP312();
    }

    /**
     * Create an instance of {@link EnvelopInfo }
     * 
     */
    public EnvelopInfo createEnvelopInfo() {
        return new EnvelopInfo();
    }

    /**
     * Create an instance of {@link Package.DataInfo.SignedData.Data.EXP312 .ExpMftHead }
     * 
     */
    public Package.DataInfo.SignedData.Data.EXP312 .ExpMftHead createPackageDataInfoSignedDataDataEXP312ExpMftHead() {
        return new Package.DataInfo.SignedData.Data.EXP312 .ExpMftHead();
    }

    /**
     * Create an instance of {@link Package.DataInfo.SignedData.Data.EXP312 .ExpMftList }
     * 
     */
    public Package.DataInfo.SignedData.Data.EXP312 .ExpMftList createPackageDataInfoSignedDataDataEXP312ExpMftList() {
        return new Package.DataInfo.SignedData.Data.EXP312 .ExpMftList();
    }

}
