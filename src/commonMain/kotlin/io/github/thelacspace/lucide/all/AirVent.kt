package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AirVent") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,17.5f)
                curveTo(18.937424f,18.203201f,19.2606f,19.463175f,18.77737f,20.530764f)
                curveTo(18.294144f,21.598352f,17.134209f,22.18702f,15.987245f,21.946753f)
                curveTo(14.840281f,21.706488f,14.014127f,20.701775f,14.0f,19.53f)
                lineTo(14.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,12.0f)
                lineTo(4.0f,12.0f)
                curveTo(2.8954306f,12.0f,2.0f,11.104569f,2.0f,10.0f)
                lineTo(2.0f,5.0f)
                curveTo(2.0f,3.8954306f,2.8954306f,3.0f,4.0f,3.0f)
                lineTo(20.0f,3.0f)
                curveTo(21.10457f,3.0f,22.0f,3.8954306f,22.0f,5.0f)
                lineTo(22.0f,10.0f)
                curveTo(22.0f,11.104569f,21.10457f,12.0f,20.0f,12.0f)
                lineTo(18.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,8.0f)
                lineTo(18.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.6f,15.572f)
                curveTo(5.951754f,16.207407f,5.8127184f,17.199697f,6.261368f,17.988798f)
                curveTo(6.710017f,18.777899f,7.633827f,19.1659f,8.511379f,18.933804f)
                curveTo(9.388931f,18.701708f,10.00013f,17.907726f,10.0f,17.0f)
                lineTo(10.0f,12.0f)
            }
}

public val LucideIcons.All.AirVentDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AirVent: ImageVector
    @Composable get() = AirVentDefinition.asImageVector()
