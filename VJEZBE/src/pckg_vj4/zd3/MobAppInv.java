package pckg_vj4.zd3;

import java.util.Stack;

public class MobAppInv {
    private Stack<PaymentServiceInt> undoStack;
    private Stack<PaymentServiceInt> redoStack;

    public MobAppInv() {
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void performTransaction(PaymentServiceInt transaction) {
        transaction.execute();
        undoStack.push(transaction);
        redoStack.clear(); // Clear redo stack when new transaction is performed
    }

    public void undoLastTransaction() {
        if (undoStack.isEmpty()) {
            System.out.println("Warning: No transactions to undo!");
            return;
        }
        PaymentServiceInt transaction = undoStack.pop();
        transaction.undo();
        redoStack.push(transaction);
    }

    public void redoLastTransaction() {
        if (redoStack.isEmpty()) {
            System.out.println("Warning: No transactions to redo!");
            return;
        }
        PaymentServiceInt transaction = redoStack.pop();
        transaction.redo();
        undoStack.push(transaction);
    }
}
