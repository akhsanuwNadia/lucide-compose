package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Hotel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,22.0)
                lineTo(10.0,15.430000305175781)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,11.0)
                lineTo(12.010000228881836,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,7.0)
                lineTo(12.010000228881836,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,15.430000305175781)
                lineTo(14.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,16.0)
                curveTo(13.222222328186035,14.666666984558105,10.777777671813965,14.666666984558105,9.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,11.0)
                lineTo(16.010000228881836,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,7.0)
                lineTo(16.010000228881836,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,11.0)
                lineTo(8.010000228881836,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,7.0)
                lineTo(8.010000228881836,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,2.0)
                lineTo(18.0,2.0)
                lineTo(20.0,2.0)
                lineTo(20.0,22.0)
                lineTo(18.0,22.0)
                lineTo(6.0,22.0)
                lineTo(4.0,22.0)
                lineTo(4.0,2.0)
                lineTo(6.0,2.0)
                close()
            }
}

public val LucideIcons.All.HotelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Hotel: ImageVector
    @Composable get() = HotelDefinition.asImageVector()
