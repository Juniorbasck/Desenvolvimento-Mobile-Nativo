package com.example.teste;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BancoDados {

    private static final String TAG = "BancoDados";

    // Nomes das colunas
    static final String KEY_ID = "id";
    static final String KEY_NOME = "nome";
    static final String KEY_DIA = "dia";

    // Configuração do banco de dados
    private static final String NOME_BANCO = "db_disciplinas";
    private static final String NOME_TABELA = "disciplinas";
    private static final int VERSAO_BANCO = 1;

    // SQL de criação da tabela
    private static final String SQL_CREATE_TABLE = "CREATE TABLE " + NOME_TABELA + " (" +
            KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            KEY_NOME + " TEXT NOT NULL, " +
            KEY_DIA + " INTEGER);";

    final Context context;
    MeuOpenHelper openHelper;
    SQLiteDatabase db;

    public BancoDados(Context context) {
        this.context = context;
        openHelper = new MeuOpenHelper(context);
        db = openHelper.getWritableDatabase();
    }

    private static class MeuOpenHelper extends SQLiteOpenHelper {

        MeuOpenHelper(Context context) {
            super(context, NOME_BANCO, null, VERSAO_BANCO);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(SQL_CREATE_TABLE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + NOME_TABELA);
            onCreate(db);
        }
    }
}
