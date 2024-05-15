package boardgame;

import java.util.Arrays;

public class Board {
    // qtd linhas do tabuleiro
    private int rows;

    // qtd colunas do tabuleiro
    private int columns;

    // matriz de peças
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        // A matriz de peças é instanciada com a quantidade de linhas e colunas informado
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    @Override
    public String toString() {
        return "Board{" +
                "rows=" + rows +
                ", columns=" + columns +
                ", pieces=" + Arrays.toString(pieces) +
                '}';
    }
}
