package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Spade") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,18.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,14.499f)
                curveTo(2.000456f,16.77687f,3.4050071f,18.818747f,5.5320754f,19.63378f)
                curveTo(7.6591434f,20.448812f,10.068511f,19.868322f,11.591f,18.174f)
                curveTo(11.821676f,17.959612f,12.178847f,17.960049f,12.408999f,18.175f)
                curveTo(13.931487f,19.869322f,16.340855f,20.449812f,18.467924f,19.63478f)
                curveTo(20.594992f,18.819748f,21.999544f,16.777872f,22.0f,14.5f)
                curveTo(22.0f,12.21f,20.5f,10.5f,19.0f,9.0f)
                lineTo(13.507999f,3.6880002f)
                curveTo(13.131211f,3.254955f,12.586519f,3.00468f,12.012514f,3.000853f)
                curveTo(11.438508f,2.9970264f,10.890528f,3.2400172f,10.507999f,3.6680002f)
                lineTo(5.0f,8.999f)
                curveTo(3.5f,10.499f,2.0f,12.198999f,2.0f,14.499f)
            }
}

public val LucideIcons.All.SpadeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Spade: ImageVector
    @Composable get() = SpadeDefinition.asImageVector()
