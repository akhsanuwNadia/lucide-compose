package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Astroid") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.983f,21.186f)
                curveTo(12.894598f,21.659292f,12.481477f,22.002394f,12.0f,22.002394f)
                curveTo(11.518523f,22.002394f,11.105402f,21.659292f,11.017f,21.186f)
                curveTo(10.310136f,16.982979f,7.0170226f,13.689865f,2.8140001f,12.983001f)
                curveTo(2.340709f,12.894599f,1.9976068f,12.481478f,1.9976068f,12.000001f)
                curveTo(1.9976068f,11.518524f,2.340709f,11.105403f,2.8140001f,11.017001f)
                curveTo(7.0170226f,10.310137f,10.310136f,7.0170236f,11.017f,2.814001f)
                curveTo(11.105402f,2.34071f,11.518523f,1.9976077f,12.0f,1.9976077f)
                curveTo(12.481477f,1.9976077f,12.894598f,2.34071f,12.983f,2.814001f)
                curveTo(13.689864f,7.017024f,16.982979f,10.310137f,21.186f,11.017001f)
                curveTo(21.659292f,11.105403f,22.002394f,11.518524f,22.002394f,12.000001f)
                curveTo(22.002394f,12.481478f,21.659292f,12.894599f,21.186f,12.983001f)
                curveTo(16.982979f,13.689865f,13.689865f,16.982979f,12.983001f,21.186f)
            }
}

public val LucideIcons.All.AstroidDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Astroid: ImageVector
    @Composable get() = AstroidDefinition.asImageVector()
