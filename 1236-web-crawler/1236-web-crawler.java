/**
 * // This is the HtmlParser's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface HtmlParser {
 *     public List<String> getUrls(String url) {}
 * }
 */

class Solution {
    //BFS, O(n) time, O(n) space
    public List<String> crawl(String startUrl, HtmlParser htmlParser) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        Set<String> visitedSet = new HashSet<>();

        String split[] = startUrl.split("/");
        String domain = split[0] + "//" + split[2];
        queue.offer(startUrl);
        visitedSet.add(startUrl);

        while (!queue.isEmpty()) {
            String u = queue.poll();
            result.add(u);
            for (String v : htmlParser.getUrls(u)) {
                if (v.startsWith(domain) && !visitedSet.contains(v)) {
                    queue.offer(v);
                    visitedSet.add(v);
                }
            }
        }
        return result;
    }
    
    /*DFS, O(n) time, O(n) space
   //public List<String> crawl(String startUrl, HtmlParser htmlParser) {
        List<String> result = new ArrayList<>();
        Set<String> visitedSet = new HashSet<>();
        String split[] = startUrl.split("/");
        String domain = split[0] + "//" + split[2];

        visitedSet.add(startUrl);
        dfs(startUrl, htmlParser, domain, visitedSet, result);
        return result;
    }

   //private void dfs(String url, HtmlParser htmlParser, String domain, Set<String> visitedSet, List<String> result) {
        result.add(url);

        for (String v : htmlParser.getUrls(url)) {
            if (v.startsWith(domain) && !visitedSet.contains(v)) {
                visitedSet.add(v);
                dfs(v, htmlParser, domain, visitedSet, result);

            }
        }
    }*/
}