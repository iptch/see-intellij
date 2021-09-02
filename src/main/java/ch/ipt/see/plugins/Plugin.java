package ch.ipt.see.plugins;

import java.time.Instant;
import java.util.List;

public class Plugin {

    private String id;
    private String author;
    private int version;
    private Instant releaseDate;
    private List<String> compatibleExtensions;
    private PluginType pluginType;

    public Plugin(String id, String author, int version) {
        this.id = id;
        this.author = author;
        this.version = version;
        version = version;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Instant getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Instant releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<String> getCompatibleExtensions() {
        return compatibleExtensions;
    }

    public void setCompatibleExtensions(List<String> compatibleExtensions) {
        this.compatibleExtensions = compatibleExtensions;
    }

    public PluginType getPluginType() {
        return pluginType;
    }

    public void setPluginType(PluginType pluginType) {
        this.pluginType = pluginType;
    }
}
