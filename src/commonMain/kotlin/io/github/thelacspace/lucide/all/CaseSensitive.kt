package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CaseSensitive") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,16.0)
                lineTo(6.039000034332275,6.310000419616699)
                curveTo(6.1166582107543945,6.1237263679504395,6.2986860275268555,6.0024003982543945,6.500499725341797,6.0024003982543945)
                curveTo(6.7023138999938965,6.0024003982543945,6.884341716766357,6.1237263679504395,6.961999893188477,6.310000419616699)
                lineTo(11.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,9.0)
                lineTo(22.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.303999900817871,13.0)
                lineTo(9.696000099182129,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,12.5)
                curveTo(14.994391441345215,13.754158020019531,15.660258293151855,14.91545581817627,16.745466232299805,15.544159889221191)
                curveTo(17.830673217773438,16.172863006591797,19.169326782226562,16.172863006591797,20.254533767700195,15.544159889221191)
                curveTo(21.33974266052246,14.91545581817627,22.0056095123291,13.754158020019531,22.0,12.5)
                curveTo(22.0056095123291,11.245841979980469,21.33974266052246,10.08454418182373,20.254533767700195,9.455840110778809)
                curveTo(19.169326782226562,8.827136993408203,17.830673217773438,8.827136993408203,16.745466232299805,9.455840110778809)
                curveTo(15.660258293151855,10.08454418182373,14.994391441345215,11.245841979980469,15.0,12.5)
            }
}

public val LucideIcons.All.CaseSensitiveDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CaseSensitive: ImageVector
    @Composable get() = CaseSensitiveDefinition.asImageVector()
