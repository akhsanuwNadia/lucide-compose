package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PackageOpen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,22.0f)
                lineTo(12.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.17f,2.21f)
                curveTo(15.676439f,1.9268357f,16.29356f,1.9268357f,16.8f,2.21f)
                lineTo(21.0f,4.57f)
                curveTo(21.605581f,4.912442f,21.98f,5.5543017f,21.98f,6.25f)
                curveTo(21.98f,6.9456987f,21.605581f,7.5875583f,21.0f,7.9300003f)
                lineTo(8.82f,14.79f)
                curveTo(8.311767f,15.079899f,7.688233f,15.079899f,7.18f,14.79f)
                lineTo(3.0f,12.43f)
                curveTo(2.394418f,12.087558f,2.0200002f,11.445699f,2.0200002f,10.75f)
                curveTo(2.0200002f,10.054302f,2.394418f,9.412443f,3.0f,9.070001f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,13.0f)
                lineTo(20.0f,16.869999f)
                curveTo(20.000795f,17.639427f,19.572725f,18.345165f,18.89f,18.699999f)
                lineTo(12.889999f,21.779999f)
                curveTo(12.3320875f,22.069942f,11.667912f,22.069942f,11.11f,21.779999f)
                lineTo(5.1099997f,18.699999f)
                curveTo(4.4272747f,18.345165f,3.9992044f,17.63943f,4.0f,16.87f)
                lineTo(4.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,12.43f)
                curveTo(21.605581f,12.087558f,21.98f,11.445699f,21.98f,10.75f)
                curveTo(21.98f,10.054302f,21.605581f,9.412443f,21.0f,9.070001f)
                lineTo(8.83f,2.2f)
                curveTo(8.3251295f,1.9108756f,7.70487f,1.9108756f,7.2f,2.2f)
                lineTo(3.0f,4.57f)
                curveTo(2.3944178f,4.912442f,2.0199997f,5.5543017f,2.0199997f,6.25f)
                curveTo(2.0199997f,6.9456987f,2.3944178f,7.5875583f,3.0f,7.9300003f)
                lineTo(15.18f,14.790001f)
                curveTo(15.684653f,15.07994f,16.305347f,15.07994f,16.81f,14.790001f)
                close()
            }
}

public val LucideIcons.All.PackageOpenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PackageOpen: ImageVector
    @Composable get() = PackageOpenDefinition.asImageVector()
