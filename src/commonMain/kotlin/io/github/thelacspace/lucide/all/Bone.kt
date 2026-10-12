package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f,10.0f)
                curveTo(17.7f,9.3f,18.69f,10.0f,19.5f,10.0f)
                curveTo(20.395828f,10.004006f,21.225325f,9.528387f,21.6744f,8.753239f)
                curveTo(22.123474f,7.9780903f,22.123474f,7.0219097f,21.6744f,6.2467613f)
                curveTo(21.225325f,5.471613f,20.395828f,4.9959936f,19.5f,5.0f)
                curveTo(19.223858f,5.0f,19.0f,4.7761426f,19.0f,4.5f)
                curveTo(19.004005f,3.6041727f,18.528387f,2.7746744f,17.753239f,2.3256004f)
                curveTo(16.97809f,1.8765261f,16.02191f,1.8765261f,15.246761f,2.3256004f)
                curveTo(14.471613f,2.7746744f,13.995994f,3.6041727f,14.0f,4.5f)
                curveTo(14.0f,5.31f,14.7f,6.3f,14.0f,7.0f)
                lineTo(7.0f,14.0f)
                curveTo(6.3f,14.7f,5.31f,14.0f,4.5f,14.0f)
                curveTo(3.1236522f,14.006155f,2.0111554f,15.123638f,2.0111554f,16.5f)
                curveTo(2.0111554f,17.876362f,3.1236522f,18.993845f,4.5f,19.0f)
                curveTo(4.78f,19.0f,5.0f,19.22f,5.0f,19.5f)
                curveTo(4.9959936f,20.395828f,5.471613f,21.225325f,6.2467613f,21.6744f)
                curveTo(7.0219097f,22.123474f,7.9780903f,22.123474f,8.753239f,21.6744f)
                curveTo(9.528387f,21.225325f,10.004006f,20.395828f,10.0f,19.5f)
                curveTo(10.0f,18.69f,9.3f,17.7f,10.0f,17.0f)
                close()
            }
}

public val LucideIcons.All.BoneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bone: ImageVector
    @Composable get() = BoneDefinition.asImageVector()
