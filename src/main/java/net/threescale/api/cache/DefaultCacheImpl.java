package net.threescale.api.cache;

import net.threescale.api.v2.HttpSender;
import org.jboss.cache.Cache;
import org.jboss.cache.DefaultCacheFactory;

/**
 * A cache that uses the default xml file (etc/default.xml).
 */
public class DefaultCacheImpl extends CacheImplCommon implements ApiCache {

    public DefaultCacheImpl(String host_url, String provider_key, HttpSender sender) {
        super(host_url, provider_key, sender, new DefaultCacheFactory().createCache("etc/default.xml"));
    }

    public DefaultCacheImpl(String host_url, String provider_key, HttpSender sender, Cache data_cache) {
        super(host_url, provider_key, sender, data_cache);
    }
}
