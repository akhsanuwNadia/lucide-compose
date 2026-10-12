package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ToolCase") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,15.0f)
                lineTo(14.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.5f,4.058f)
                lineTo(15.071f,2.6290002f)
                curveTo(15.169322f,2.3825548f,15.361556f,2.1852877f,15.605379f,2.0806315f)
                curveTo(15.849201f,1.9759752f,16.124622f,1.9725105f,16.371f,2.071f)
                lineTo(21.371f,4.071f)
                curveTo(21.617613f,4.1690936f,21.815115f,4.3611994f,21.92f,4.605f)
                curveTo(22.039804f,4.8451357f,22.043488f,5.126815f,21.93f,5.37f)
                lineTo(19.598f,11.2f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.634f,11.0f)
                curveTo(15.583153f,10.880913f,15.520861f,10.767045f,15.448f,10.66f)
                lineTo(14.278f,8.903f)
                lineTo(15.587999f,7.2469997f)
                curveTo(16.124426f,6.56727f,16.162508f,5.619541f,15.68235f,4.898962f)
                curveTo(15.202191f,4.178383f,14.312862f,3.8486357f,13.478999f,4.082f)
                lineTo(11.446999f,4.652f)
                lineTo(10.2769985f,2.894f)
                curveTo(9.796918f,2.1718082f,8.906117f,1.8412883f,8.0711565f,2.0755513f)
                curveTo(7.2361956f,2.3098142f,6.6473374f,3.0554786f,6.6129985f,3.922f)
                lineTo(6.5269985f,6.0319996f)
                lineTo(4.4949985f,6.5999994f)
                curveTo(3.6615384f,6.8344874f,3.073604f,7.5786448f,3.0383172f,8.443744f)
                curveTo(3.0030303f,9.308842f,3.5284045f,10.098411f,4.3399982f,10.4f)
                lineTo(5.9569983f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,12.006f)
                curveTo(3.998404f,11.740782f,4.1022334f,11.485793f,4.2886453f,11.297131f)
                curveTo(4.4750576f,11.108468f,4.728782f,11.001587f,4.994f,11.0f)
                lineTo(19.0f,11.0f)
                curveTo(19.552284f,11.0f,20.0f,11.447715f,20.0f,12.0f)
                lineTo(20.0f,19.0f)
                curveTo(20.0f,20.10457f,19.10457f,21.0f,18.0f,21.0f)
                lineTo(6.0f,21.0f)
                curveTo(4.8954306f,21.0f,4.0f,20.10457f,4.0f,19.0f)
                close()
            }
}

public val LucideIcons.All.ToolCaseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ToolCase: ImageVector
    @Composable get() = ToolCaseDefinition.asImageVector()
