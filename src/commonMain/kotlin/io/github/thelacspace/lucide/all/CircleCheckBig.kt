package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleCheckBig") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.801000595092773,10.0)
                curveTo(22.742088317871094,14.61851978302002,20.330347061157227,19.26715850830078,16.012516021728516,21.157318115234375)
                curveTo(11.694684982299805,23.0474796295166,6.643185138702393,21.665929794311523,3.888277530670166,17.84142303466797)
                curveTo(1.13336980342865,14.016915321350098,1.4230936765670776,8.787919998168945,4.583651542663574,5.291172027587891)
                curveTo(7.744209289550781,1.7944244146347046,12.917415618896484,0.9793956279754639,17.0,3.3350000381469727)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,11.0)
                lineTo(12.0,14.0)
                lineTo(22.0,4.0)
            }
}

public val LucideIcons.All.CircleCheckBigDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleCheckBig: ImageVector
    @Composable get() = CircleCheckBigDefinition.asImageVector()
