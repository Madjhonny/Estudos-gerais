package Estudos_Filas;

public class Fila {

    private No refNoEntrada;

    public Fila() {
        this.refNoEntrada = null;
    }

    public void enqueue(No novoNo) {
        novoNo.setRefno(refNoEntrada);
        refNoEntrada = novoNo;

    }

    public No first() {
        if(!this.isEmpty()) {
            No primeiroNo = refNoEntrada;
            while (true){
                if(primeiroNo.getRefno() != null) {
                    primeiroNo = primeiroNo.getRefno();
                }
                else {
                    break;
                }
            }
        }
        return null;
    }

    public No dequeue() {
        if(!this.isEmpty()) {
            No primeiroNo = refNoEntrada;
            No noAuxiliar = refNoEntrada;
            while (true){
                if(primeiroNo.getRefno() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefno();
                }
                else {
                    noAuxiliar.setRefno(null);
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public boolean isEmpty() {
        return refNoEntrada == null? true : false;
    }

    @Override
    public String toString() {
        StringBuilder stringRetorno = new StringBuilder();
        No noAuxiliar = refNoEntrada;

        if (refNoEntrada != null) {
            while (noAuxiliar != null) {
                stringRetorno.append("[No{objeto=")
                        .append(noAuxiliar.getObject())
                        .append("}]--->");
                noAuxiliar = noAuxiliar.getRefno();
            }
            stringRetorno.append("null"); // Indica o fim da fila
        } else {
            stringRetorno.append("null"); // Fila vazia
        }

        return stringRetorno.toString();
    }

}
