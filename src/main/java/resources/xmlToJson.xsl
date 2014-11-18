<xsl:stylesheet 
  version="1.0" 
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
>
  <xsl:output indent="yes" method="text"></xsl:output>
  
  <xsl:template match="/">
  	[
  		{flights:[
  			<xsl:apply-templates select="flight"></xsl:apply-templates>
  		]
  		,hotels:[
  			<xsl:apply-templates select="hotel"></xsl:apply-templates>
  		]
  	]
  </xsl:template>

  <xsl:template match="flight">
  	{
  		company:"<xsl:value-of select="company"></xsl:value-of>",
  		date:"<xsl:value-of select="date"></xsl:value-of>",
  		typeflight:"<xsl:value-of select="typeflight"></xsl:value-of>",
  		poblationOut:<xsl:value-of select="poblationOut"></xsl:value-of>,
  		poblationReturn:<xsl:value-of select="poblationReturn"></xsl:value-of>,
  		type:"<xsl:value-of select="type"></xsl:value-of>",
  		price:<xsl:value-of select="company"></xsl:value-of>
  	}
  </xsl:template>
  <xsl:template match="hotel">
  	{
  		idhotel:"<xsl:value-of select="idhotel"></xsl:value-of>",
  		dateIn:"<xsl:value-of select="dateIn"></xsl:value-of>",
  		dateOut:"<xsl:value-of select="dateOut"></xsl:value-of>",
  		poblation:<xsl:value-of select="poblation"></xsl:value-of>,
  		type:"<xsl:value-of select="type"></xsl:value-of>",
  		price:<xsl:value-of select="company"></xsl:value-of>
  	}
  </xsl:template>

  <xsl:template match="text()" />
</xsl:stylesheet>