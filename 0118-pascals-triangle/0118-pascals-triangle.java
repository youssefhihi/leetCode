class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> triangle = new ArrayList<>();
            if (numRows == 0) {
                return triangle;
            }
            triangle.add(new ArrayList<>());
            triangle.get(0).add(1);

            for (int i = 1; i < numRows; i++) {
                List<Integer> previousRow = triangle.get(i - 1);
                List<Integer> currentRow = new ArrayList<>();
                currentRow.add(1);
                for (int j = 1; j < previousRow.size(); j++) {
                    currentRow.add(previousRow.get(j - 1) + previousRow.get(j));
                }
                currentRow.add(1);
                triangle.add(currentRow);
            }                                                                                    return triangle;
        }
}