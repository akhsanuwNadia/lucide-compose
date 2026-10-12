package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Hotel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,22.0f)
                lineTo(10.0f,15.43f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,11.0f)
                lineTo(12.01f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,7.0f)
                lineTo(12.01f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,15.43f)
                lineTo(14.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,16.0f)
                curveTo(13.222222f,14.666667f,10.777778f,14.666667f,9.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,11.0f)
                lineTo(16.01f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,7.0f)
                lineTo(16.01f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,11.0f)
                lineTo(8.01f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,7.0f)
                lineTo(8.01f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,2.0f)
                lineTo(18.0f,2.0f)
                lineTo(20.0f,2.0f)
                lineTo(20.0f,22.0f)
                lineTo(18.0f,22.0f)
                lineTo(6.0f,22.0f)
                lineTo(4.0f,22.0f)
                lineTo(4.0f,2.0f)
                lineTo(6.0f,2.0f)
                close()
            }
}

public val LucideIcons.All.HotelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Hotel: ImageVector
    @Composable get() = HotelDefinition.asImageVector()
