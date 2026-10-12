package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.35f,2.69f)
                curveTo(12.049881f,1.2449359f,16.254269f,2.1266472f,19.061861f,4.9364076f)
                curveTo(21.869453f,7.7461686f,22.74792f,11.951235f,21.3f,15.65f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.08f,19.08f)
                curveTo(16.554363f,21.628328f,12.858271f,22.630514f,9.391272f,21.707071f)
                curveTo(5.924273f,20.783628f,3.2163706f,18.075727f,2.2929282f,14.608728f)
                curveTo(1.369486f,11.141729f,2.3716712f,7.4456377f,4.92f,4.92f)
            }
}

public val LucideIcons.All.CircleOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleOff: ImageVector
    @Composable get() = CircleOffDefinition.asImageVector()
