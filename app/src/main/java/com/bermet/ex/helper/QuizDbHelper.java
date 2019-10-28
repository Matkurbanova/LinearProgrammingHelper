package com.bermet.ex.helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.bermet.ex.helper.QuizContract.*;

import java.util.ArrayList;


public class QuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "MyAwesomeQuiz.db";
    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase db;

    public QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionsTable.TABLE_NAME + " ( " +
                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME);
        onCreate(db);
    }

    private void fillQuestionsTable() {
        Question q1 = new Question("Right hand side constant in ith constraint in primal must be equal to objective coefficient for", "j^th primal variable", "i^th dual variable", "i^th primal variable", 2);
        addQuestion(q1);
        Question q2 = new Question("Which of the following is used to perform row operations on the linear programming model as well as for checking optimality?", "Simplex tableau", "Simplex method", "Primal simplex", 1);
        addQuestion(q2);
        Question q3 = new Question("Which of the following are additional variables that are introduced into the linear constraints of a linear program to transform them from inequality constraints to equality constraints.", "Pivot variable", "Slack variables", "Standard form", 2);
        addQuestion(q3);
        Question q4 = new Question("If an optimal solution exists to either the primal or symmetric dual program, then the other program also has an optimal solution and the two objective functions have the same optimal value.", "True", "False", "Doesn't exist", 1);
        addQuestion(q4);
        Question q5 = new Question("In primal-dual solutions, dual problem solution can be obtained by solving other problems classified as", "Unrestricted problem", "Original problem", "Double problem", 2);
        addQuestion(q5);
        Question q6 = new Question("If the Primal is a Minimization Problem then the Dual will be a ________ Problem.","Maximization", "Minimization", "Dual", 1);
        addQuestion(q6);
        Question q7 = new Question("Which of the following are variables that are non-negative in terms of the optimal solution?", "Constraints", "Non-basic variables", "Basic variables", 3);
        addQuestion(q7);
        Question q8 = new Question("Which of the following is a model used to achieve the best outcome given a maximum or minimum equation with linear constraints?", "Dual problem", "Linear program", "Primal problem", 2);
        addQuestion(q8);
        Question q9 = new Question("Which of the following are variables that are zero in terms of the optimal solution?", "Non-basic variables", "Basic variable", "Slack variables", 1);
        addQuestion(q9);
        Question q10 = new Question("Which of the following is the baseline format for all linear programs before solving for the optimal solution?", "Linear program", "Standard form", "Primal problem", 2);
        addQuestion(q10);
        Question q11 = new Question("Which of the following is used in row operations to identify which variable will become the unit value and is a  key factor in the conversion of the unit value?", "Pivot variable", "Basic variable", "Maximization", 1);
        addQuestion(q11);
        Question q12 = new Question("Which of the following  is an approach to solving linear programming models by hand using slack variables, tableaus, and pivot variables as a means to finding the optimal solution of  an optimization problem?", "Simplex method", "Primal problem", "Dual problem", 1);
        addQuestion(q12);
        Question q13 = new Question("Which of the following is an expression that does not have one definite solution and is distinguishable by its ‘greater than’ or ‘less than’ symbols in the place of a traditional equal sign?", "Constraints", "Quality", "Inequality", 3);
        addQuestion(q13);
        Question q14 = new Question("The coefficients of the decision variables in the objective function of the Dual are the same as the _________ of the resource constraints of the Primal.","Duality","Shadow price","RHS", 3);
        addQuestion(q14);
        Question q15 = new Question(" The  Technological  Coefficients  in  the  constraints  of  the  dual  problem  are  the ________ of the technological coefficients of the constraints in the Primal.", "Opposite", "Transpose", "Maximization", 2);
        addQuestion(q15);
        Question q16 = new Question("Number of ________ in the Primal is equal to the number of constraints in the Dual and vice versa.", " Decision variables", "Non-basic variable", "Basic variable", 1);
        addQuestion(q16);
        Question q17 = new Question(" Dual of a Dual linear programming problem is the __________.", "Primal linear programming", "Standard form", "Duality", 1);
        addQuestion(q17);
        Question q18 = new Question("The  value  of  the  dual  variables  represent  the _________ of  the  corresponding resources.", "Primal", "Shadow prices", "constraints", 2);
        addQuestion(q18);
        Question q19 = new Question("The optimal value of Objective function of a Dual is ________ the optimal value of Objective function of the associated Primal.", "Linear program", "Equal to", "Constraints", 2);
        addQuestion(q19);
        Question q20 = new Question("Which of the following  is  the  criterion  for  selecting  the  best  values  of  the  decision variables such as profit maximization, sales maximization, cost minimization, etc?", "Dual problem", "Constraints", "Objective function", 3);
        addQuestion(q20);
        Question q21 = new Question("Which of the following  is a general problem of optimizing a function of several variables subject to a number of constraints?", "Mathematical programming", "Linear programming", "Duality", 1);
        addQuestion(q21);
        Question q22 = new Question("Which of the following of a maximization linear programming model are the values assigned to the variables in the objective function to give the largest zeta value.  The optimal solution would exist on the corner points of the graph of the entire model? ", "Objective function", "Linear programming", "Optimal solution", 1);
        addQuestion(q22);
        Question q23 = new Question("In converting a less-than-or-equal constraint for use in a simplex table, we must add", "Surplus variable", "Slack variable", "Artificial variable", 2);
        addQuestion(q23);
        Question q24 = new Question("In converting a greater-than-or-equal constraint for use in a simplex table, we must add", "A slack and an artificial variable.", "Slack variable", "Artificial variable", 1);
        addQuestion(q24);
        Question q25 = new Question("In converting an equal constraint for use in a simplex table, we must add", "A surplus variable", "A slack variable", "A artificial variable", 3);
        addQuestion(q25);
        Question q26 = new Question("In a Simplex table, the pivot row is computed by", "Dividing every number in the pivot row by the pivot number", "Dividing every number in the profit row by the pivot number.", "Dividing every number in the pivot row by the corresponding number in the profit row.", 2);
        addQuestion(q26);
        Question q27 = new Question("A feasible solution requires that all artificial variables is", "equal to zero", "greater than zero", "less than zero", 1);
        addQuestion(q27);
        Question q28 = new Question("Which of the column of numbers below row 0 in a simplex tableau that is in the column for the current entering basic variable?", "Pivot variable", "Pivot column", "Pivot row", 2);
        addQuestion(q28);
        Question q29 = new Question("Which of the the number in a simplex tableau that currently is at the intersection of the pivot column and the pivot row?", "Pivot variable", "Pivot column", "Pivot number", 3);
        addQuestion(q29);
        Question q30 = new Question("Which of the following is a row of numbers to the right of the Z column in the simplex tableau?", "Row of a simplex tableau", "Column of a simplex tableau", "Row of simplex method", 1);
        addQuestion(q30);
        Question q31 = new Question("Which of the following the linear programming problem that has a dual relationship with the original (primal) linear programming problem of interest according to duality theory?", "Dual problem", "Primal problem", "Simplex method", 1);
        addQuestion(q31);
        Question q32 = new Question("Which of the following the original linear programming problem of interest when using duality theory to define an associated dual problem?", "Dual problem", "Primal problem", "Simplex method", 2);
        addQuestion(q32);
        Question q33 = new Question("Which of the following is an algorithm that deals with a linear programming problem as if the simplex method were being applied simultaneously to its dual? ", "Dual simplex method", "Primal simplex method", "Simplex method", 1);
        addQuestion(q33);
        Question q34 = new Question("Which of the following is a maximization/minimization, subject to linear constraints, of an objective function that is a concave/convex quadratic function?", "Pivot variable", "Linear programming", "Quadratic programming", 3);
        addQuestion(q34);
        Question q35 = new Question("If either of the problems P or D has a ﬁnite optimal solution, so does the other, and the corresponding optimal objective function values are equal. If any of these two problems is unbounded, the other problem has no feasible solution.", "Weak duality theorem", "Strong duality theorem", "Duality theorem", 2);
        addQuestion(q35);
















    }


    private void addQuestion(Question question) {
        ContentValues cv = new ContentValues();
        cv.put(QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        db.insert(QuestionsTable.TABLE_NAME, null, cv);
    }

    public ArrayList<Question> getAllQuestions() {
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME, null);

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }
}