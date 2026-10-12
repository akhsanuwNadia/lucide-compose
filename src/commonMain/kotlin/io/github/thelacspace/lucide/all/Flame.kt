package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Flame") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,3.0f)
                quadTo(13.0f,7.0f,16.0f,9.5f)
                quadTo(19.0f,12.0f,19.0f,15.0f)
                curveTo(18.982765f,18.853773f,15.853812f,21.968765f,12.0f,21.968765f)
                curveTo(8.146188f,21.968765f,5.017235f,18.853773f,5.0f,15.0f)
                curveTo(5.0f,13.918149f,5.350889f,12.86548f,6.0f,12.0f)
                curveTo(6.006155f,13.376348f,7.1236386f,14.488845f,8.5f,14.488845f)
                curveTo(9.876362f,14.488845f,10.993845f,13.376348f,11.0f,12.0f)
                curveTo(11.0f,10.0f,9.5f,9.0f,9.5f,7.0f)
                quadTo(9.5f,5.0f,12.0f,3.0f)
            }
}

public val LucideIcons.All.FlameDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Flame: ImageVector
    @Composable get() = FlameDefinition.asImageVector()
