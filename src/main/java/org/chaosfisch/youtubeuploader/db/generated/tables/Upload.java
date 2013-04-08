/**
 * This class is generated by jOOQ
 */
package org.chaosfisch.youtubeuploader.db.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class Upload extends org.jooq.impl.UpdatableTableImpl<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord> {

	private static final long serialVersionUID = -403131264;

	/**
	 * The singleton instance of <code>PUBLIC.UPLOAD</code>
	 */
	public static final org.chaosfisch.youtubeuploader.db.generated.tables.Upload UPLOAD = new org.chaosfisch.youtubeuploader.db.generated.tables.Upload();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord> getRecordType() {
		return org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord.class;
	}

	/**
	 * The column <code>PUBLIC.UPLOAD.ID</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.ARCHIVED</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Boolean> ARCHIVED = createField("ARCHIVED", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.CATEGORY</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.String> CATEGORY = createField("CATEGORY", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.UPLOAD.COMMENT</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Short> COMMENT = createField("COMMENT", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.COMMENTVOTE</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Boolean> COMMENTVOTE = createField("COMMENTVOTE", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.DESCRIPTION</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR.length(10000), this);

	/**
	 * The column <code>PUBLIC.UPLOAD.EMBED</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Boolean> EMBED = createField("EMBED", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.FAILED</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Boolean> FAILED = createField("FAILED", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.FILE</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.String> FILE = createField("FILE", org.jooq.impl.SQLDataType.VARCHAR.length(500), this);

	/**
	 * The column <code>PUBLIC.UPLOAD.VISIBILITY</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Short> VISIBILITY = createField("VISIBILITY", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.KEYWORDS</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.String> KEYWORDS = createField("KEYWORDS", org.jooq.impl.SQLDataType.VARCHAR.length(1000), this);

	/**
	 * The column <code>PUBLIC.UPLOAD.MIMETYPE</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.String> MIMETYPE = createField("MIMETYPE", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.UPLOAD.MOBILE</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Boolean> MOBILE = createField("MOBILE", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.RATE</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Boolean> RATE = createField("RATE", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.TITLE</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.UPLOAD.UPLOADURL</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.String> UPLOADURL = createField("UPLOADURL", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.UPLOAD.VIDEORESPONSE</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Short> VIDEORESPONSE = createField("VIDEORESPONSE", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.DATE_OF_START</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.util.GregorianCalendar> DATE_OF_START = createField("DATE_OF_START", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new org.chaosfisch.youtubeuploader.db.converter.CalendarConverter()), this);

	/**
	 * The column <code>PUBLIC.UPLOAD.INPROGRESS</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Boolean> INPROGRESS = createField("INPROGRESS", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.LOCKED</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Boolean> LOCKED = createField("LOCKED", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.VIDEOID</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.String> VIDEOID = createField("VIDEOID", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.UPLOAD.ACCOUNT_ID</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Integer> ACCOUNT_ID = createField("ACCOUNT_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.ENDDIR</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.String> ENDDIR = createField("ENDDIR", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.UPLOAD.LICENSE</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Short> LICENSE = createField("LICENSE", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.DATE_OF_RELEASE</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.util.GregorianCalendar> DATE_OF_RELEASE = createField("DATE_OF_RELEASE", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new org.chaosfisch.youtubeuploader.db.converter.CalendarConverter()), this);

	/**
	 * The column <code>PUBLIC.UPLOAD.NUMBER</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Short> NUMBER = createField("NUMBER", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.PAUSEONFINISH</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Boolean> PAUSEONFINISH = createField("PAUSEONFINISH", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.THUMBNAIL</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.String> THUMBNAIL = createField("THUMBNAIL", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.UPLOAD.FACEBOOK</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Boolean> FACEBOOK = createField("FACEBOOK", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.TWITTER</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Boolean> TWITTER = createField("TWITTER", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.MESSAGE</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.String> MESSAGE = createField("MESSAGE", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.UPLOAD.INSTREAMDEFAULTS</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Boolean> INSTREAMDEFAULTS = createField("INSTREAMDEFAULTS", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.CLAIM</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Boolean> CLAIM = createField("CLAIM", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.OVERLAY</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Boolean> OVERLAY = createField("OVERLAY", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.TRUEVIEW</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Boolean> TRUEVIEW = createField("TRUEVIEW", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.INSTREAM</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Boolean> INSTREAM = createField("INSTREAM", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.PRODUCT</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Boolean> PRODUCT = createField("PRODUCT", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.SYNDICATION</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Integer> SYNDICATION = createField("SYNDICATION", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.MONETIZETITLE</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.String> MONETIZETITLE = createField("MONETIZETITLE", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.UPLOAD.MONETIZEDESCRIPTION</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.String> MONETIZEDESCRIPTION = createField("MONETIZEDESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.UPLOAD.MONETIZEID</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.String> MONETIZEID = createField("MONETIZEID", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.UPLOAD.MONETIZENOTES</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.String> MONETIZENOTES = createField("MONETIZENOTES", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.UPLOAD.MONETIZETMSID</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.String> MONETIZETMSID = createField("MONETIZETMSID", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.UPLOAD.MONETIZEISAN</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.String> MONETIZEISAN = createField("MONETIZEISAN", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.UPLOAD.MONETIZEEIDR</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.String> MONETIZEEIDR = createField("MONETIZEEIDR", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.UPLOAD.MONETIZETITLEEPISODE</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.String> MONETIZETITLEEPISODE = createField("MONETIZETITLEEPISODE", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.UPLOAD.MONETIZESEASONNB</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.String> MONETIZESEASONNB = createField("MONETIZESEASONNB", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.UPLOAD.MONETIZEEPISODENB</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.String> MONETIZEEPISODENB = createField("MONETIZEEPISODENB", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>PUBLIC.UPLOAD.MONETIZECLAIMTYPE</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Integer> MONETIZECLAIMTYPE = createField("MONETIZECLAIMTYPE", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.MONETIZECLAIMPOLICY</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Integer> MONETIZECLAIMPOLICY = createField("MONETIZECLAIMPOLICY", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.MONETIZEASSET</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Integer> MONETIZEASSET = createField("MONETIZEASSET", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>PUBLIC.UPLOAD.MONETIZEPARTNER</code>. 
	 */
	public final org.jooq.TableField<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Boolean> MONETIZEPARTNER = createField("MONETIZEPARTNER", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * Create a <code>PUBLIC.UPLOAD</code> table reference
	 */
	public Upload() {
		super("UPLOAD", org.chaosfisch.youtubeuploader.db.generated.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>PUBLIC.UPLOAD</code> table reference
	 */
	public Upload(java.lang.String alias) {
		super(alias, org.chaosfisch.youtubeuploader.db.generated.Public.PUBLIC, org.chaosfisch.youtubeuploader.db.generated.tables.Upload.UPLOAD);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, java.lang.Integer> getIdentity() {
		return org.chaosfisch.youtubeuploader.db.generated.Keys.IDENTITY_UPLOAD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord> getPrimaryKey() {
		return org.chaosfisch.youtubeuploader.db.generated.Keys.CONSTRAINT_95;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord>>asList(org.chaosfisch.youtubeuploader.db.generated.Keys.CONSTRAINT_95);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.chaosfisch.youtubeuploader.db.generated.tables.records.UploadRecord, ?>>asList(org.chaosfisch.youtubeuploader.db.generated.Keys.CONSTRAINT_1D4);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.chaosfisch.youtubeuploader.db.generated.tables.Upload as(java.lang.String alias) {
		return new org.chaosfisch.youtubeuploader.db.generated.tables.Upload(alias);
	}
}
