package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Mouth") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                curveTo(8.6f,13.333333f,15.4f,13.333333f,22.0f,12.0f)
                curveTo(22.0f,11.447715f,21.552284f,11.0f,21.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.457f,11.159f)
                curveTo(1.9980118f,11.454946f,1.8613422f,12.064394f,2.15f,12.528f)
                curveTo(4.263616f,15.936594f,7.989279f,18.010168f,12.0f,18.010168f)
                curveTo(16.010721f,18.010168f,19.736383f,15.936594f,21.85f,12.528f)
                curveTo(22.1378f,12.064346f,22.000736f,11.455573f,21.542f,11.16f)
                curveTo(19.116f,9.592f,17.892f,8.875999f,16.063f,7.516f)
                curveTo(15.040759f,6.745567f,13.609836f,6.8338065f,12.69f,7.724f)
                curveTo(12.303701f,8.092255f,11.696298f,8.092255f,11.309999f,7.724f)
                curveTo(10.3866f,6.841925f,8.96178f,6.7540617f,7.9369993f,7.516f)
                curveTo(6.1069994f,8.875999f,4.8839993f,9.592f,2.4569993f,11.158999f)
            }
}

public val LucideIcons.All.MouthDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Mouth: ImageVector
    @Composable get() = MouthDefinition.asImageVector()
