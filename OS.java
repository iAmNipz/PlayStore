package PlayStore;

public class OS {

	private String Type;
	private int Version;

	public String getType() {
		return Type;
	}

	public int getVersion() {
		return Version;
	}

	public OS(String type, int version) {

		Type = type;
		Version = version;
	}

}
