package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EggFried") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0,12.5)
                curveTo(7.994391441345215,13.754158020019531,8.660258293151855,14.91545581817627,9.745466232299805,15.544159889221191)
                curveTo(10.830674171447754,16.172863006591797,12.169325828552246,16.172863006591797,13.254533767700195,15.544159889221191)
                curveTo(14.339741706848145,14.91545581817627,15.005608558654785,13.754158020019531,15.0,12.5)
                curveTo(15.005608558654785,11.245841979980469,14.339741706848145,10.08454418182373,13.254533767700195,9.455840110778809)
                curveTo(12.169325828552246,8.827136993408203,10.830674171447754,8.827136993408203,9.745466232299805,9.455840110778809)
                curveTo(8.660258293151855,10.08454418182373,7.994391441345215,11.245841979980469,8.0,12.5)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,8.0)
                curveTo(3.0,4.5,5.5,2.0,9.5,2.0)
                curveTo(14.5,2.0,14.329999923706055,5.0,17.0,7.0)
                curveTo(19.670000076293945,9.0,22.0,9.0,22.0,13.0)
                curveTo(22.0,17.5,19.5,19.5,15.0,19.5)
                curveTo(12.5,19.5,12.5,22.0,9.0,22.0)
                curveTo(5.5,22.0,2.0,20.0,2.0,16.5)
                curveTo(2.0,13.5,3.5,13.5,3.5,11.5)
                curveTo(3.5,10.0,3.0,9.0,3.0,8.0)
                close()
            }
}

public val LucideIcons.All.EggFriedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EggFried: ImageVector
    @Composable get() = EggFriedDefinition.asImageVector()
