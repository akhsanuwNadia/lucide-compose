package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CaseLower") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,9.0)
                lineTo(10.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,6.0)
                lineTo(14.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,12.5)
                curveTo(13.994391441345215,13.754158020019531,14.660258293151855,14.91545581817627,15.745466232299805,15.544159889221191)
                curveTo(16.830673217773438,16.172863006591797,18.169326782226562,16.172863006591797,19.254533767700195,15.544159889221191)
                curveTo(20.33974266052246,14.91545581817627,21.0056095123291,13.754158020019531,21.0,12.5)
                curveTo(21.0056095123291,11.245841979980469,20.33974266052246,10.08454418182373,19.254533767700195,9.455840110778809)
                curveTo(18.169326782226562,8.827136993408203,16.830673217773438,8.827136993408203,15.745466232299805,9.455840110778809)
                curveTo(14.660258293151855,10.08454418182373,13.994391441345215,11.245841979980469,14.0,12.5)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,12.5)
                curveTo(2.9943912029266357,13.754158020019531,3.6602580547332764,14.91545581817627,4.7454657554626465,15.544159889221191)
                curveTo(5.830673694610596,16.172863006591797,7.169326305389404,16.172863006591797,8.254533767700195,15.544159889221191)
                curveTo(9.339741706848145,14.91545581817627,10.005608558654785,13.754158020019531,10.0,12.5)
                curveTo(10.005608558654785,11.245841979980469,9.339741706848145,10.08454418182373,8.254533767700195,9.455840110778809)
                curveTo(7.169326305389404,8.827136993408203,5.830673694610596,8.827136993408203,4.7454657554626465,9.455840110778809)
                curveTo(3.6602580547332764,10.08454418182373,2.9943912029266357,11.245841979980469,3.0,12.5)
            }
}

public val LucideIcons.All.CaseLowerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CaseLower: ImageVector
    @Composable get() = CaseLowerDefinition.asImageVector()
