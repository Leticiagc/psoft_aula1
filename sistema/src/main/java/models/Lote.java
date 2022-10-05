package models;
import java.util.Date;
import java.util.UUID;

public class Lote {
	private int qtd;
	private Date dataV;
	private Produto prodt;
	private String id;

	public Lote(int qtd, Date dataV, Produto prodt) {
		this.qtd = qtd;
		this.dataV = dataV;
		this.prodt = prodt;
		this.id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}

	public int getQtd() {
		return qtd;
	}

	public Date getDataV() {
		return dataV;
	}

	public Produto getProdt() {
		return prodt;
	}

	@Override
	public String toString() {
		return "Lote [qtd=" + qtd + ", dataV=" + dataV + ", prodt=" + prodt + "]";
	}
}
