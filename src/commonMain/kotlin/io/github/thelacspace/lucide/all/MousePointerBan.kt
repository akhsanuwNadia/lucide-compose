package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MousePointerBan") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.034f,2.681f)
                curveTo(1.9603165f,2.4961476f,2.0037522f,2.2851758f,2.144464f,2.144464f)
                curveTo(2.2851758f,2.0037522f,2.4961476f,1.9603165f,2.681f,2.034f)
                lineTo(11.681f,5.534f)
                curveTo(11.87951f,5.610866f,12.007586f,5.804991f,12.000149f,6.017733f)
                curveTo(11.992712f,6.2304754f,11.851393f,6.415183f,11.648f,6.4779997f)
                lineTo(8.204f,7.545f)
                curveTo(7.888525f,7.6425376f,7.641538f,7.8895245f,7.5440006f,8.205f)
                lineTo(6.4780006f,11.648f)
                curveTo(6.415184f,11.851393f,6.230477f,11.992713f,6.017734f,12.00015f)
                curveTo(5.8049912f,12.0075865f,5.6108665f,11.87951f,5.5340004f,11.681f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,16.0f)
                curveTo(9.990385f,18.149986f,11.131871f,20.140781f,12.992228f,21.21856f)
                curveTo(14.852584f,22.296337f,17.147417f,22.296337f,19.007772f,21.21856f)
                curveTo(20.86813f,20.140781f,22.009615f,18.149986f,22.0f,16.0f)
                curveTo(22.009615f,13.850015f,20.86813f,11.859219f,19.007772f,10.781441f)
                curveTo(17.147417f,9.703663f,14.852584f,9.703663f,12.992228f,10.781441f)
                curveTo(11.131871f,11.859219f,9.990385f,13.850015f,10.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.8f,11.8f)
                lineTo(20.2f,20.2f)
            }
}

public val LucideIcons.All.MousePointerBanDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MousePointerBan: ImageVector
    @Composable get() = MousePointerBanDefinition.asImageVector()
