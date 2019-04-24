package belajarclavin.model;

public class ResultModel {
	private String nama;
	private Double lintang;
	private Double bujur;
	private Long populasi;
	private int dem;
	private String gazetterRecord;

	public ResultModel(String nama, Double lintang, Double bujur, Long populasi, int dem) {
		this.nama = nama;
		this.lintang = lintang;
		this.bujur = bujur;
		this.populasi = populasi;
		this.dem = dem;
	}

	public ResultModel(String nama, Double lintang, Double bujur, Long populasi, int dem, String gazetterRecord) {
		this.nama = nama;
		this.lintang = lintang;
		this.bujur = bujur;
		this.populasi = populasi;
		this.dem = dem;
		this.gazetterRecord = gazetterRecord;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public Double getLintang() {
		return lintang;
	}

	public void setLintang(Double lintang) {
		this.lintang = lintang;
	}

	public Double getBujur() {
		return bujur;
	}

	public void setBujur(Double bujur) {
		this.bujur = bujur;
	}

	public Long getPopulasi() {
		return populasi;
	}

	public void setPopulasi(Long populasi) {
		this.populasi = populasi;
	}

	public int getDem() {
		return dem;
	}

	public void setDem(int dem) {
		this.dem = dem;
	}

	public String getGazetterRecord() {
		return gazetterRecord;
	}

	public void setGazetterRecord(String gazetterRecord) {
		this.gazetterRecord = gazetterRecord;
	}

}
