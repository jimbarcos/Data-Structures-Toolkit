/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package machine_problem1;

/**
 *
 * @author Jim Aerol
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class TreesAlgo {
    TreeNode root;

    public TreesAlgo() {
        this.root = null;
    }

    // Method to insert a new node in the binary tree
    public void insertData(int val) {
        root = insertRecursive(root, val);
    }

    private TreeNode insertRecursive(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            root.left = insertRecursive(root.left, val);
        } else if (val > root.val) {
            root.right = insertRecursive(root.right, val);
        }

        return root;
    }

    // Method to perform inorder traversal of the binary tree
        public String inorderTraversalData(TreeNode root) {
         return inorderTraversalHelper(root);
     }

     private String inorderTraversalHelper(TreeNode root) {
         if (root == null) {
            return "";
        }
        String left = inorderTraversalHelper(root.left);
        String right = inorderTraversalHelper(root.right);
        if (!left.isEmpty() && !right.isEmpty()) {
            return root.val + " (" + left + ", " + right + ")";
        } else if (!left.isEmpty()) {
            return root.val + " (" + left + ")";
        } else if (!right.isEmpty()) {
            return root.val + " (" + right + ")";
        } else {
            return String.valueOf(root.val);
        }
     }
     
     
    // Method to display the binary tree
    public String displayTreeData(TreeNode root, int level) {
        if (root == null)
            return "";

        String treeData = "";
        treeData += displayTreeData(root.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++)
                treeData += "|\t";
            treeData += "|-------" + root.val + "\n";
        } else {
            treeData += root.val + "\n";
        }
        treeData += displayTreeData(root.left, level + 1);

        return treeData;
    }

    
    // Method to delete a node from the binary tree
    public int deleteData(int val) {
        if (root == null) {
            return -1; // Tree is empty
        }
        if (root.val == val) {
            // Special case: deleting the root node
            TreeNode newRoot = deleteRoot(root);
            if (newRoot == null) {
                root = null;
            } else {
                root = newRoot;
            }
            return 2; // Node deleted successfully
        } else {
            TreeNode deletedNode = deleteRecursive(root, val);
            if (deletedNode != null) {
                return 2; // Node deleted successfully
            } else {
                return -1; // Node not found or deletion unsuccessful
            }
        }
    }
    
    private TreeNode deleteRoot(TreeNode root) {
        // Special case: Root has no child
        if (root.left == null && root.right == null) {
            return null;
        }
        // Special case: Root has only one child
        if (root.left == null) {
            return root.right;
        }
        if (root.right == null) {
            return root.left;
        }
        // Root has two children: Get the inorder successor (smallest in the right subtree)
        root.val = minValue(root.right);

        // Delete the inorder successor from the right subtree
        root.right = deleteRecursive(root.right, root.val);
        return root;
    }

    private TreeNode deleteRecursive(TreeNode root, int val) {
        if (root == null) {
            return null; // Node not found
        }

        if (val < root.val) {
            root.left = deleteRecursive(root.left, val);
        } else if (val > root.val) {
            root.right = deleteRecursive(root.right, val);
        } else {
            // Node with the value to be deleted is found
            if (root.left == null) {
                return root.right; // Node has no left child
            } else if (root.right == null) {
                return root.left; // Node has no right child
            }

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.val = minValue(root.right);

            // Delete the inorder successor from the right subtree
            root.right = deleteRecursive(root.right, root.val);
        }
        return root;
    }

    private int minValue(TreeNode root) {
        int minVal = root.val;
        while (root.left != null) {
            minVal = root.left.val;
            root = root.left;
        }
        return minVal;
    }
    
    
    // Method to display parent nodes, leaf nodes, and their levels
    public String displayParentLeafLevels() {
        if (root == null) {
            return "Tree is empty.";
        }

        String result = "\n";
        result += displayParentLeafLevelsHelper(root, 0);
        return result;
    }

    private String displayParentLeafLevelsHelper(TreeNode node, int level) {
        if (node == null) {
            return "";
        }

        String nodeInfo = "";

        // Check if the node is a leaf node
        if (level == 0) {
            nodeInfo += node.val + " (Root), Level: " + level + "\n";
        }
        // Check if the node is a leaf node
        else if (node.left == null && node.right == null) {
            nodeInfo += node.val + " (Leaf), Level: " + level + "\n";
        } else {
            // Check if the node is a parent node
            if (node.left != null || node.right != null) {
                nodeInfo += node.val + " (Parent & Leaf), Level: " + level + "\n";
            }
        }

        // Recursively traverse left and right subtrees
        nodeInfo += displayParentLeafLevelsHelper(node.left, level + 1);
        nodeInfo += displayParentLeafLevelsHelper(node.right, level + 1);

        return nodeInfo;
    }
}

