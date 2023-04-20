package entidade;
public class Voo {
    private String companhia;
    private String origem;
    private String destino;
    private String dataVoo;
    private String horaVoo;
    private int numeroDoVoo;
    private boolean[] assentos;

    public Voo(String companhia, String origem, String destino, String dataVoo, String horaVoo, int numeroDoVoo) {
        this.companhia = companhia;
        this.origem = origem;
        this.destino = destino;
        this.dataVoo = dataVoo;
        this.horaVoo = horaVoo;
        this.numeroDoVoo = numeroDoVoo;
        this.assentos = new boolean[100];
    }



    public int vagas() {
        int count = 0;
        for (int i = 0; i < assentos.length; i++) {
            if (!assentos[i]) {
                count++;
            }
        }
        return count;
    }

    public int getVoo() {
        return numeroDoVoo;
    }

    public String getData() {
        return dataVoo;
    }

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getDataVoo() {
		return dataVoo;
	}

	public void setDataVoo(String dataVoo) {
		this.dataVoo = dataVoo;
	}

	public String getHoraVoo() {
		return horaVoo;
	}

	public void setHoraVoo(String horaVoo) {
		this.horaVoo = horaVoo;
	}

	public int getNumeroDoVoo() {
		return numeroDoVoo;
	}

	public void setNumeroDoVoo(int numeroDoVoo) {
		this.numeroDoVoo = numeroDoVoo;
	}

	public boolean[] getAssentos() {
		return assentos;
	}

	public void setAssentos(boolean[] assentos) {
		this.assentos = assentos;
	}
}