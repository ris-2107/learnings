def stairCaseTraversal(height, maxSteps):
    waysToTop=[ 0 for _ in range(height+1)]
    waysToTop[0]=1
    waysToTop[1]=1

    for currentHeight in range(2, height+1):
        step=1
        
