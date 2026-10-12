package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookSearch") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,22.0f)
                lineTo(5.5f,22.0f)
                curveTo(4.1236525f,21.993845f,3.0111554f,20.876362f,3.0111554f,19.5f)
                curveTo(3.0111554f,18.123638f,4.1236525f,17.006155f,5.5f,17.0f)
                lineTo(10.000999f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,22.0f)
                lineTo(19.121f,20.122f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,19.5f)
                lineTo(3.0f,4.5f)
                curveTo(3.0f,3.1192882f,4.119288f,2.0f,5.5f,2.0f)
                lineTo(18.0f,2.0f)
                curveTo(18.552284f,2.0f,19.0f,2.4477153f,19.0f,3.0f)
                lineTo(19.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,18.0f)
                curveTo(13.995193f,19.074993f,14.565935f,20.07039f,15.496114f,20.60928f)
                curveTo(16.426292f,21.148169f,17.573708f,21.148169f,18.503887f,20.60928f)
                curveTo(19.434065f,20.07039f,20.004808f,19.074993f,20.0f,18.0f)
                curveTo(20.004808f,16.925007f,19.434065f,15.929609f,18.503887f,15.39072f)
                curveTo(17.573708f,14.851831f,16.426292f,14.851831f,15.496114f,15.39072f)
                curveTo(14.565935f,15.929609f,13.995193f,16.925007f,14.0f,18.0f)
            }
}

public val LucideIcons.All.BookSearchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookSearch: ImageVector
    @Composable get() = BookSearchDefinition.asImageVector()
