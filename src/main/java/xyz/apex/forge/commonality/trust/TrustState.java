package xyz.apex.forge.commonality.trust;

public enum TrustState
{
	// file had no ADS to pull the Zone.Identity from
	// some trusted launchers strip ADS on download,
	// so we have to assume that in this case the mod jar came from a trusted source
	UNKNOWN(true),

	// we are currently in a development environment
	DEVELOPMENT(true),

	// mod was downloaded from a trusted source
	TRUSTED(true),

	// mod was downloaded from a untrustworthy source
	UNTRUSTED(false);

	public final boolean trusted;

	TrustState(boolean trusted)
	{
		this.trusted = trusted;
	}

	public boolean isTrusted()
	{
		return trusted;
	}
}