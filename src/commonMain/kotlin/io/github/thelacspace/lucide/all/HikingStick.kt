package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HikingStick") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.5f,10.5f)
                lineTo(2.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.352f,11.648f)
                curveTo(15.881432f,12.118497f,15.1185665f,12.118497f,14.647999f,11.648f)
                lineTo(12.351999f,9.351999f)
                curveTo(11.881502f,8.881433f,11.881502f,8.1185665f,12.351999f,7.6479993f)
                lineTo(13.072f,6.9279995f)
                curveTo(13.351327f,6.6491413f,13.70692f,6.4591675f,14.094f,6.3819995f)
                lineTo(14.693f,6.2619996f)
                curveTo(15.485057f,6.1035256f,16.10403f,5.484157f,16.262f,4.6919994f)
                lineTo(16.382f,4.0939994f)
                curveTo(16.459167f,3.70692f,16.649141f,3.351327f,16.928f,3.0719995f)
                lineTo(17.647999f,2.3519995f)
                curveTo(18.118567f,1.8815024f,18.881432f,1.8815024f,19.352f,2.3519995f)
                lineTo(21.647999f,4.648f)
                curveTo(22.118496f,5.118567f,22.118496f,5.8814325f,21.647999f,6.3519998f)
                lineTo(15.627998f,12.372f)
                curveTo(15.088099f,12.907092f,14.875771f,13.690163f,15.071415f,14.424696f)
                curveTo(15.26706f,15.15923f,15.840768f,15.732938f,16.575302f,15.928583f)
                curveTo(17.309835f,16.124228f,18.092905f,15.9119f,18.627998f,15.372f)
                lineTo(18.828999f,15.171f)
                curveTo(20.220148f,13.781759f,21.00128f,11.896032f,21.0f,9.93f)
                lineTo(21.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,21.0f)
                lineTo(3.0f,18.0f)
            }
}

public val LucideIcons.All.HikingStickDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HikingStick: ImageVector
    @Composable get() = HikingStickDefinition.asImageVector()
