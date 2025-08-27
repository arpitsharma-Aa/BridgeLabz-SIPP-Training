// City Zone as Graph Node
CLASS Zone {
    STRING name
    INT crimeRate
    LIST<Zone> neighbors
}

// Graph of city zones
CLASS CityGraph {
    LIST<Zone> zones

    METHOD addZone(zone) {
        zones.add(zone)
    }

    METHOD addConnection(z1, z2) {
        z1.neighbors.add(z2)
        z2.neighbors.add(z1)
    }

    // DFS to detect high-risk connected zones
    METHOD dfs(zone, visited, threshold) {
        visited.add(zone)
        IF zone.crimeRate > threshold THEN
            PRINT "High-risk zone: " + zone.name
        ENDIF

        FOR each neighbor IN zone.neighbors
            IF neighbor NOT IN visited
                dfs(neighbor, visited, threshold)
    }
}

// MAIN
zoneA = Zone("A", 70)
zoneB = Zone("B", 30)
zoneC = Zone("C", 90)
zoneD = Zone("D", 60)

graph = CityGraph()
graph.addZone(zoneA)
graph.addZone(zoneB)
graph.addZone(zoneC)
graph.addZone(zoneD)

graph.addConnection(zoneA, zoneB)
graph.addConnection(zoneA, zoneC)
graph.addConnection(zoneC, zoneD)

visited = EMPTY_SET()
graph.dfs(zoneA, visited, 50)   // threshold = 50 crimes
