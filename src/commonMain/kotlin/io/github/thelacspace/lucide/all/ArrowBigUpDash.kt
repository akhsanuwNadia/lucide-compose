package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowBigUpDash") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,16.0f)
                curveTo(14.552285f,16.0f,15.0f,15.552285f,15.0f,15.0f)
                lineTo(15.0f,13.0f)
                curveTo(15.0f,12.447715f,15.447715f,12.0f,16.0f,12.0f)
                lineTo(19.293f,12.0f)
                curveTo(19.579f,12.000061f,19.836868f,11.8278055f,19.946325f,11.563578f)
                curveTo(20.05578f,11.29935f,19.995264f,10.995203f,19.793f,10.793f)
                lineTo(12.853999f,3.854f)
                curveTo(12.627601f,3.627324f,12.320372f,3.4999554f,11.999999f,3.4999554f)
                curveTo(11.679626f,3.4999554f,11.372397f,3.627324f,11.145999f,3.854f)
                lineTo(4.205999f,10.794001f)
                curveTo(4.0044484f,10.996297f,3.9443843f,11.29998f,4.0537505f,11.56377f)
                curveTo(4.1631165f,11.827561f,4.420436f,11.999659f,4.705999f,12.000001f)
                lineTo(8.0f,12.000001f)
                curveTo(8.552285f,12.000001f,9.0f,12.447716f,9.0f,13.000001f)
                lineTo(9.0f,15.000001f)
                curveTo(9.000001f,15.552285f,9.447716f,16.0f,10.0f,16.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,20.0f)
                lineTo(15.0f,20.0f)
            }
}

public val LucideIcons.All.ArrowBigUpDashDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowBigUpDash: ImageVector
    @Composable get() = ArrowBigUpDashDefinition.asImageVector()
