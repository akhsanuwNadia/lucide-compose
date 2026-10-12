package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LensConvex") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.432999610900879,2.0)
                curveTo(13.765007972717285,2.003278970718384,14.073739051818848,2.171132802963257,14.256999969482422,2.447999954223633)
                curveTo(17.91506576538086,8.290660858154297,17.91506576538086,15.709339141845703,14.256999969482422,21.552000045776367)
                curveTo(14.073739051818848,21.828866958618164,13.765007972717285,21.996721267700195,13.432999610900879,22.0)
                lineTo(10.566999435424805,22.0)
                curveTo(10.234991073608398,21.996721267700195,9.926259994506836,21.828866958618164,9.742999076843262,21.552000045776367)
                curveTo(6.084933757781982,15.709339141845703,6.084933757781982,8.290660858154297,9.742999076843262,2.447999954223633)
                curveTo(9.926260948181152,2.1711325645446777,10.234992027282715,2.0032787322998047,10.567000389099121,2.0)
                close()
            }
}

public val LucideIcons.All.LensConvexDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LensConvex: ImageVector
    @Composable get() = LensConvexDefinition.asImageVector()
