def stairCaseToTravel(height, maxSteps):
    currentNoOfWays=0
    waysToTop=[1]

    for currentHeight in range(1, height+1):
        startofWindow=currentHeight-maxSteps+1
        endOfWindow = currentHeight -1
        if startofWindow >=0:
            currentNoOfWays-= waysToTop[startofWindow]
        currentNoOfWays +=waysToTop(currentNoOfWays)
    return waysToTop[height]