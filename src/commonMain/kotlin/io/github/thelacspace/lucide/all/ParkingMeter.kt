package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ParkingMeter") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,15.0f)
                lineTo(13.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,12.0f)
                lineTo(12.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,19.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.282f,19.0f)
                curveTo(15.711181f,19.00025f,16.092663f,18.726614f,16.23f,18.32f)
                lineTo(18.599998f,11.332f)
                curveTo(19.6251f,8.431247f,18.636051f,5.201196f,16.162544f,3.3717234f)
                curveTo(13.689039f,1.5422505f,10.310958f,1.5422505f,7.837452f,3.3717234f)
                curveTo(5.3639464f,5.201196f,4.3748984f,8.431247f,5.3999987f,11.332f)
                lineTo(7.7699986f,18.32f)
                curveTo(7.907336f,18.726614f,8.288817f,19.00025f,8.7179985f,19.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,9.0f)
                curveTo(8.995193f,7.9250073f,9.565935f,6.9296093f,10.496114f,6.3907204f)
                curveTo(11.426291f,5.8518314f,12.573709f,5.8518314f,13.503886f,6.3907204f)
                curveTo(14.434065f,6.9296093f,15.004807f,7.9250073f,15.0f,9.0f)
            }
}

public val LucideIcons.All.ParkingMeterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ParkingMeter: ImageVector
    @Composable get() = ParkingMeterDefinition.asImageVector()
