class Solution {
    public String simplifyPath(String path) {
        Deque<String> dirStack = new ArrayDeque<>();

        String[] dirs = path.split("/+");
        // System.out.println(Arrays.toString(dirs));

        for(String dir: dirs) {
            if(dir.isEmpty()) {
                continue;
            }

            if(dir.equals(".")) {
                continue;
            }

            if(dir.equals("..")) {
                if(!dirStack.isEmpty())
                    dirStack.pop();
                continue;
            }

            dirStack.push(dir);
            
        }

        // System.out.println(dirStack);

        Iterator<String> it = dirStack.descendingIterator();

        StringBuilder sb = new StringBuilder("/");

        while(it.hasNext()) {
            sb.append(it.next());
            if(it.hasNext())
                sb.append("/");
        }



        return sb.toString();
    }
}
