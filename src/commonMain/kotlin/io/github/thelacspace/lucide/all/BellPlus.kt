package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BellPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.268f,21.0f)
                curveTo(10.625278f,21.618752f,11.285504f,21.999912f,12.0f,21.999912f)
                curveTo(12.714495f,21.999912f,13.374721f,21.618752f,13.731999f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,8.0f)
                lineTo(21.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,5.0f)
                lineTo(18.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.002f,14.464f)
                curveTo(20.229591f,14.766914f,20.476082f,15.055154f,20.740002f,15.327f)
                curveTo(21.006485f,15.61987f,21.075064f,16.042395f,20.91489f,16.404516f)
                curveTo(20.754717f,16.766636f,20.395964f,17.000143f,20.0f,17.0f)
                lineTo(4.0f,17.0f)
                curveTo(3.6040373f,17.000141f,3.2452834f,16.766636f,3.0851107f,16.404514f)
                curveTo(2.924938f,16.042395f,2.993517f,15.61987f,3.26f,15.327f)
                curveTo(4.59f,13.956f,6.0f,12.499f,6.0f,8.0f)
                curveTo(6.000238f,5.907336f,7.090779f,3.9659846f,8.877792f,2.8770294f)
                curveTo(10.664806f,1.7880745f,12.890081f,1.7088627f,14.75f,2.6680002f)
            }
}

public val LucideIcons.All.BellPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BellPlus: ImageVector
    @Composable get() = BellPlusDefinition.asImageVector()
