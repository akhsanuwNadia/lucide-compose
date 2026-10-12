package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Star") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.525f,2.295f)
                curveTo(11.614393f,2.114392f,11.798479f,2.0001066f,12.0f,2.0001066f)
                curveTo(12.20152f,2.0001066f,12.385606f,2.114392f,12.474999f,2.295f)
                lineTo(14.785f,6.974f)
                curveTo(15.093904f,7.5991406f,15.690095f,8.032735f,16.38f,8.134f)
                lineTo(21.546f,8.889999f)
                curveTo(21.745682f,8.91893f,21.911617f,9.058731f,21.97402f,9.250606f)
                curveTo(22.03642f,9.442481f,21.984465f,9.653145f,21.84f,9.794f)
                lineTo(18.104f,13.431999f)
                curveTo(17.603844f,13.9194f,17.375383f,14.621608f,17.493f,15.309999f)
                lineTo(18.375f,20.449999f)
                curveTo(18.410254f,20.649622f,18.328556f,20.851868f,18.164543f,20.970995f)
                curveTo(18.000528f,21.090122f,17.782932f,21.105265f,17.604f,21.009998f)
                lineTo(12.986f,18.581999f)
                curveTo(12.36832f,18.257666f,11.63068f,18.257666f,11.0130005f,18.581999f)
                lineTo(6.396f,21.01f)
                curveTo(6.2171383f,21.104689f,5.9999666f,21.089252f,5.8362956f,20.970219f)
                curveTo(5.672624f,20.851185f,5.5910273f,20.649336f,5.626f,20.45f)
                lineTo(6.507f,15.311001f)
                curveTo(6.6251407f,14.622271f,6.396627f,13.919525f,5.896f,13.432001f)
                lineTo(2.16f,9.795f)
                curveTo(2.0143125f,9.654288f,1.9615612f,9.442847f,2.0240786f,9.250191f)
                curveTo(2.086596f,9.057535f,2.2534492f,8.9173565f,2.454f,8.889f)
                lineTo(7.619f,8.134f)
                curveTo(8.309714f,8.033514f,8.906842f,7.5997834f,9.216f,6.974f)
                close()
            }
}

public val LucideIcons.All.StarDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Star: ImageVector
    @Composable get() = StarDefinition.asImageVector()
