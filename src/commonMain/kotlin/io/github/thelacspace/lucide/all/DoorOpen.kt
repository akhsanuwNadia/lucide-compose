package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DoorOpen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,21.0f)
                lineTo(2.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,3.0f)
                lineTo(7.0f,3.0f)
                curveTo(5.8954306f,3.0f,5.0f,3.8954306f,5.0f,5.0f)
                lineTo(5.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,12.0f)
                lineTo(14.01f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,21.0f)
                lineTo(19.0f,5.0f)
                curveTo(19.000286f,4.0206456f,18.291338f,3.1851454f,17.325f,3.026f)
                lineTo(11.162001f,2.013f)
                curveTo(10.872314f,1.9654424f,10.576363f,2.0475767f,10.352618f,2.2376246f)
                curveTo(10.128874f,2.4276726f,9.999939f,2.706436f,10.0f,3.0f)
                lineTo(10.0f,21.0f)
                curveTo(10.000081f,21.286776f,10.123277f,21.559715f,10.338289f,21.749477f)
                curveTo(10.553303f,21.93924f,10.8394375f,22.027561f,11.124f,21.992f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,21.0f)
                lineTo(19.0f,21.0f)
            }
}

public val LucideIcons.All.DoorOpenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DoorOpen: ImageVector
    @Composable get() = DoorOpenDefinition.asImageVector()
