package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EggFried") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f,12.5f)
                curveTo(7.9943914f,13.754158f,8.660258f,14.915456f,9.745466f,15.54416f)
                curveTo(10.830674f,16.172863f,12.169326f,16.172863f,13.254534f,15.54416f)
                curveTo(14.339742f,14.915456f,15.005609f,13.754158f,15.0f,12.5f)
                curveTo(15.005609f,11.245842f,14.339742f,10.084544f,13.254534f,9.45584f)
                curveTo(12.169326f,8.827137f,10.830674f,8.827137f,9.745466f,9.45584f)
                curveTo(8.660258f,10.084544f,7.9943914f,11.245842f,8.0f,12.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,8.0f)
                curveTo(3.0f,4.5f,5.5f,2.0f,9.5f,2.0f)
                curveTo(14.5f,2.0f,14.33f,5.0f,17.0f,7.0f)
                curveTo(19.67f,9.0f,22.0f,9.0f,22.0f,13.0f)
                curveTo(22.0f,17.5f,19.5f,19.5f,15.0f,19.5f)
                curveTo(12.5f,19.5f,12.5f,22.0f,9.0f,22.0f)
                curveTo(5.5f,22.0f,2.0f,20.0f,2.0f,16.5f)
                curveTo(2.0f,13.5f,3.5f,13.5f,3.5f,11.5f)
                curveTo(3.5f,10.0f,3.0f,9.0f,3.0f,8.0f)
                close()
            }
}

public val LucideIcons.All.EggFriedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EggFried: ImageVector
    @Composable get() = EggFriedDefinition.asImageVector()
