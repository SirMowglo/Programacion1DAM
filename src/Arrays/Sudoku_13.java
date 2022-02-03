package Arrays;

import java.util.Arrays;

public class Sudoku_13 {
    public static void main(String[] args) {
        //Comprueba si un sudoku, es un sudoku funcional o no

        int sudoku[][][][] = new int[3][3][3][3];
        boolean correcto = true;


        //HARDCODE DEL SUDOKU
        //sudoku[filas][filasCasillas][columnasCasillas][columnas]
        //Primera fila
        sudoku[0][0][0][0] =1; //5;
        sudoku[0][0][0][1] =2; //3;
        sudoku[0][0][0][2] =3; //4;

        sudoku[0][0][1][0] =4; //6;
        sudoku[0][0][1][1] =5; //7;
        sudoku[0][0][1][2] =6; //8;

        sudoku[0][0][2][0] =7; //9;
        sudoku[0][0][2][1] =8; //1;
        sudoku[0][0][2][2] =9; //2;
        //Segunda fila
        sudoku[1][0][0][0] =1; //6;
        sudoku[1][0][0][1] =2; //7;
        sudoku[1][0][0][2] =3; //2;

        sudoku[1][0][1][0] =4; //1;
        sudoku[1][0][1][1] =5; //9;
        sudoku[1][0][1][2] =6; //5;

        sudoku[1][0][2][0] =7; //3;
        sudoku[1][0][2][1] =8; //4;
        sudoku[1][0][2][2] =9; //8;
        //Tercera fila
        sudoku[2][0][0][0] =1; //1;
        sudoku[2][0][0][1] =2; //9;
        sudoku[2][0][0][2] =3; //8;

        sudoku[2][0][1][0] =4; //3;
        sudoku[2][0][1][1] =5; //4;
        sudoku[2][0][1][2] =6; //2;

        sudoku[2][0][2][0] =7; //5;
        sudoku[2][0][2][1] =8; //6;
        sudoku[2][0][2][2] =9; //7;
        //Cuarta fila
        sudoku[0][1][0][0] =1; //8;
        sudoku[0][1][0][1] =2; //5;
        sudoku[0][1][0][2] =3; //9;

        sudoku[0][1][1][0] =4; //7;
        sudoku[0][1][1][1] =5; //6;
        sudoku[0][1][1][2] =6; //1;

        sudoku[0][1][2][0] =7; //4;
        sudoku[0][1][2][1] =8; //2;
        sudoku[0][1][2][2] =9; //3;
        //Quinta fila
        sudoku[1][1][0][0] =1; //4;
        sudoku[1][1][0][1] =2; //2;
        sudoku[1][1][0][2] =3; //6;

        sudoku[1][1][1][0] =4; //8;
        sudoku[1][1][1][1] =5; //5;
        sudoku[1][1][1][2] =6; //3;

        sudoku[1][1][2][0] =7; //7;
        sudoku[1][1][2][1] =8; //9;
        sudoku[1][1][2][2] =9; //1;
        //Sexta fila
        sudoku[2][1][0][0] =1; //7;
        sudoku[2][1][0][1] =2; //1;
        sudoku[2][1][0][2] =3; //3;

        sudoku[2][1][1][0] =4; //9;
        sudoku[2][1][1][1] =5; //2;
        sudoku[2][1][1][2] =6; //4;

        sudoku[2][1][2][0] =7; //8;
        sudoku[2][1][2][1] =8; //5;
        sudoku[2][1][2][2] =9; //6;
        //Septima fila
        sudoku[0][2][0][0] =1; //9;
        sudoku[0][2][0][1] =2; //6;
        sudoku[0][2][0][2] =3; //1;

        sudoku[0][2][1][0] =4; //5;
        sudoku[0][2][1][1] =5; //3;
        sudoku[0][2][1][2] =6; //7;

        sudoku[0][2][2][0] =7; //2;
        sudoku[0][2][2][1] =8; //8;
        sudoku[0][2][2][2] =9; //4;
        //Octava fila
        sudoku[1][2][0][0] =1; //2;
        sudoku[1][2][0][1] =2; //8;
        sudoku[1][2][0][2] =3; //7;

        sudoku[1][2][1][0] =4; //4;
        sudoku[1][2][1][1] =5; //1;
        sudoku[1][2][1][2] =6; //9;

        sudoku[1][2][2][0] =7; //6;
        sudoku[1][2][2][1] =8; //3;
        sudoku[1][2][2][2] =9; //5;
        //Novena fila
        sudoku[2][2][0][0] =1; //3;
        sudoku[2][2][0][1] =2; //4;
        sudoku[2][2][0][2] =3; //5;

        sudoku[2][2][1][0] =4; //2;
        sudoku[2][2][1][1] =5; //8;
        sudoku[2][2][1][2] =6; //6;

        sudoku[2][2][2][0] =7; //1;
        sudoku[2][2][2][1] =8; //7;
        sudoku[2][2][2][2] =9; //9;

        //COMPRUEBA SI LAS COLUMNAS, FILAS Y CASILLAS SON CORRECTAS
        int columnasCasillas =0;
        int columnas = 0;
        int filasCasillas = 0;
        int filas =0;
        int comprobacion = 1;

        //Columnas
        for(columnasCasillas=0; columnasCasillas<3; columnasCasillas++){
            for(columnas=0; columnas<3; columnas++){
                comprobacion = 1;
                for(int pos =1; pos<=9; pos++){
                    for(filasCasillas=0; filasCasillas<3; filasCasillas++){
                        for(filas =0; filas<3; filas++){
                            if(comprobacion == sudoku[filas][filasCasillas][columnasCasillas][columnas]){
                                comprobacion++;
                            }
                        }
                    }
                    if (pos ==9 && comprobacion !=10){
                        correcto = false;
                    }
                }
            }
        }
        //Filas
        for(filasCasillas=0; filasCasillas<3; filasCasillas++){
            for(filas=0; filas<3; filas++){
                comprobacion = 1;
                for(int pos =1; pos<=9; pos++){
                    for(columnasCasillas=0; columnasCasillas<3; columnasCasillas++){
                        for(columnas =0; columnas<3; columnas++){
                            if(comprobacion == sudoku[filas][filasCasillas][columnasCasillas][columnas]){
                                comprobacion++;
                            }
                        }
                    }
                    if (pos ==9 && comprobacion !=10){
                        correcto = false;
                    }
                }
            }
        }
        //Casillas
        for(filasCasillas=0; filasCasillas<3; filasCasillas++){
            for(columnasCasillas=0; filas<3; filas++){
                comprobacion = 1;
                for(int pos =1; pos<=9; pos++){
                    for(filas=0; filas<3; filas++){
                        for(columnas =0; columnas<3; columnas++){
                            if(comprobacion == sudoku[filas][filasCasillas][columnasCasillas][columnas]){
                                comprobacion++;
                            }
                        }
                    }
                    if (pos ==9 && comprobacion !=10){
                        correcto = false;
                    }
                }
            }
        }
        //COMPROBACION DEL SUDOKU
        System.out.println(comprobacion);
        if(correcto == false){
            System.out.println("El sudoku es incorrecto");
        }else{
            System.out.println("El sudoku esta DE LOCOS nena");
        }

        //MUESTRA EL SUDOKU FINAL
        for(int pos = 0; pos<3; pos++){
            for(int pos2 = 0; pos2<3; pos2++){
                System.out.println(Arrays.deepToString(sudoku[pos2][pos]));
            }
        }
    }
}
