package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DatabaseX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f,17.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.323f,13.744f)
                curveTo(20.413675f,13.235143f,21.000004f,12.625388f,21.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,13.127f)
                lineTo(21.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,17.0f)
                lineTo(17.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,12.0f)
                curveTo(3.0003662f,12.886716f,4.1775246f,13.727954f,6.215451f,14.297872f)
                curveTo(8.253377f,14.867788f,10.943274f,15.107993f,13.563f,14.954f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,5.0f)
                lineTo(3.0f,19.0f)
                curveTo(3.0003612f,19.853613f,4.091615f,20.666756f,6.000473f,21.235786f)
                curveTo(7.909331f,21.804817f,10.455017f,22.075848f,13.0f,21.981f)
            }
}

public val LucideIcons.All.DatabaseXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DatabaseX: ImageVector
    @Composable get() = DatabaseXDefinition.asImageVector()
